package com.axy.intelligentcontrolplatform;

/**
 * ReadAsSqlTxt：
 *
 * @author: li wenqiang
 * @date: 2020/5/18 11:15
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import org.apache.poi.ss.usermodel.*;

/**
 * 将excel数据读出并生产sql语句
 * @author zhouy
 *
 */
public class ReadAsSqlTxt {

    private static final String TABLE_NAME = "t_zh_ztjx_sybw";
    private static final String EXCEL_PATH = "E:\\AxyDocuments\\excel\\sy\\试验部位.xlsx";
    private static final String TXT_PATH = "E:\\AxyDocuments\\sql\\sy\\试验部位.sql";
    private static final String CHARSET = "utf-8";

    public static void main(String[] args) {
        ReadAsSqlTxt readAsSqlTxt = new ReadAsSqlTxt();
        try {
            readAsSqlTxt.doBusiness(EXCEL_PATH, TXT_PATH);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("======处理异常！");
        }
    }

    /**
     * 内部类需要外部类来调用，而不能再main方法中直接调用
     * @param excelPath
     * @param txtPath
     * @throws Exception
     */
    private void doBusiness(String excelPath, String txtPath) throws Exception{
        ReadExcelToTxt readExcelToTxt = new ReadExcelToTxt();
        readExcelToTxt.todo(excelPath, txtPath);
    }

    class ReadExcelToTxt{
        private void todo(String excelPath, String txtPath) throws Exception{
            long beginTime = System.currentTimeMillis();
            // 目标文件流
            FileOutputStream fos = new FileOutputStream(new File(txtPath));
            // 源文件流
            FileInputStream fis = new FileInputStream(excelPath);
            // 生成一个excel文件对象
//            HSSFWorkbook workBook = new HSSFWorkbook(fis);
            Workbook workbook = WorkbookFactory.create(fis);
            // 获取第一个sheet
            Sheet sheet = workbook.getSheetAt(0);
            // 解析sheet
            // getLastRowNum没有加上第一行，得加上1
            int rowLength = sheet.getLastRowNum()+1;
            System.out.println("======待解析行数："+rowLength); // 46950
            Row num = sheet.getRow(0);
            String field = "";
            for (Cell cell : num) {
                field+=cell+",";
            }
            String newField = field.substring(0,field.lastIndexOf(","));

            for(int i=1; i<rowLength; i++){
                // 去掉了第一行，第一行为表头
                Row row = sheet.getRow(i);
                String fieldValue = "";
                for (Cell cell : row) {
                    if(checkDate(cell.toString())){
                        String  anString =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(cell.getDateCellValue());
                        anString=anString.toString();
                        cell.setCellValue(anString);
                    }
                    cell.setCellType(Cell.CELL_TYPE_STRING);

                    fieldValue += !"".equals(cell.getStringCellValue())?"'"+cell+"',":null+",";
                }
                String newFieldValue = fieldValue.substring(0,fieldValue.lastIndexOf(","));

                String sql = "insert into " + TABLE_NAME +
                        "(" + newField +
                        ") "
                        + "values(" +newFieldValue +
                        ");commit;";
                fos.write(sql.getBytes(CHARSET));
                fos.write("\r\n".getBytes(CHARSET));
            }
            fos.close();
            long endTime = System.currentTimeMillis();
            System.out.println("======处理成功！供耗时："+(endTime-beginTime)/1000+"秒");
        }
        /**
         * 获取相应类型值
         * @param cell
         * @return
         */
        @SuppressWarnings("static-access")
        private String getValue(Cell cell){
            if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN){
                return String.valueOf(cell.getBooleanCellValue());
            }else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC){
                return String.valueOf((int)cell.getNumericCellValue());
            }else if(cell.getCellType()==cell.CELL_TYPE_STRING){
                return String.valueOf(cell.getStringCellValue());
            }else if(cell.getCellType()==cell.CELL_TYPE_BLANK){
                return "";
            }else{
                return "";
            }
        }
        private boolean checkDate(String str){
            String[] dataArr =str.split("-");
            try {
                if(dataArr.length == 3){
                    int x = Integer.parseInt(dataArr[0]);
                    String y =  dataArr[1];
                    int z = Integer.parseInt(dataArr[2]);
                    if(x>0 && x<32 && z>0 && z< 10000 && y.endsWith("月")){
                        return true;
                    }
                }
            } catch (Exception e) {
                return false;
            }
            return false;
        }

    }
}