package com.axy.intelligentcontrolplatform.basic.dto;

import lombok.Data;

@Data
public class MessageBean {
    private int total;
    private Object rows;
    private String message;
    private String status;

    public static MessageBean getListSuccessMessageBean(int total,Object rows){
        MessageBean messageBean = new MessageBean();
        messageBean.setTotal(total);
        messageBean.setRows(rows);
        messageBean.setMessage("获取数据成功");
        messageBean.setStatus("success");
        return messageBean;
    }
    public static MessageBean getOneSuccessMessageBean(Object rows){
        MessageBean messageBean = new MessageBean();
        messageBean.setRows(rows);
        messageBean.setMessage("获取数据成功");
        messageBean.setStatus("success");
        return messageBean;
    }


    public static MessageBean postSuccessMessageBean(){
        MessageBean messageBean = new MessageBean();
        messageBean.setStatus("success");
        messageBean.setMessage("添加成功");
        return messageBean;
    }

    public static MessageBean putSuccessMessageBean(){
        MessageBean messageBean = new MessageBean();
        messageBean.setStatus("success");
        messageBean.setMessage("修改成功");
        return messageBean;
    }

    public static MessageBean deleteSuccessMessageBean(){
        MessageBean messageBean = new MessageBean();
        messageBean.setStatus("success");
        messageBean.setMessage("删除成功");
        return messageBean;
    }

}
