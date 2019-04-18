package com.zhouyou.http.demo.model;

import java.io.Serializable;
import java.util.List;

/**
 * <p>描述：获取首页肤质测肤数据</p>
 * 作者： zhouyou<br>
 * 日期： 2016/4/27 16:03<br>
 * 版本： v2.0<br>
 */
public class TestBean implements Serializable {
    @Override
    public String toString() {
        return "TestBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * code : 0
     * message : success
     * data : {"customers":[{"id":1,"name":"houjianjun","phone":"18670801569","email":"474664736@qq.com"},{"id":2,"name":"110fklajsdkfl","phone":"110","email":"110fklajsdkfl"},{"id":3,"name":"111fklajsdkfl","phone":"111","email":"111fklajsdkfl"},{"id":4,"name":"112fklajsdkfl","phone":"112","email":"112fklajsdkfl"},{"id":5,"name":"113fklajsdkfl","phone":"113","email":"113fklajsdkfl"},{"id":6,"name":"114fklajsdkfl","phone":"114","email":"114fklajsdkfl"},{"id":7,"name":"115fklajsdkfl","phone":"115","email":"115fklajsdkfl"},{"id":8,"name":"116fklajsdkfl","phone":"116","email":"116fklajsdkfl"},{"id":9,"name":"117fklajsdkfl","phone":"117","email":"117fklajsdkfl"},{"id":10,"name":"118fklajsdkfl","phone":"118","email":"118fklajsdkfl"}],"code":0}
     */

    private int code;
    private String message;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * customers : [{"id":1,"name":"houjianjun","phone":"18670801569","email":"474664736@qq.com"},{"id":2,"name":"110fklajsdkfl","phone":"110","email":"110fklajsdkfl"},{"id":3,"name":"111fklajsdkfl","phone":"111","email":"111fklajsdkfl"},{"id":4,"name":"112fklajsdkfl","phone":"112","email":"112fklajsdkfl"},{"id":5,"name":"113fklajsdkfl","phone":"113","email":"113fklajsdkfl"},{"id":6,"name":"114fklajsdkfl","phone":"114","email":"114fklajsdkfl"},{"id":7,"name":"115fklajsdkfl","phone":"115","email":"115fklajsdkfl"},{"id":8,"name":"116fklajsdkfl","phone":"116","email":"116fklajsdkfl"},{"id":9,"name":"117fklajsdkfl","phone":"117","email":"117fklajsdkfl"},{"id":10,"name":"118fklajsdkfl","phone":"118","email":"118fklajsdkfl"}]
         * code : 0
         */

        private int code;
        private List<CustomersBean> customers;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public List<CustomersBean> getCustomers() {
            return customers;
        }

        public void setCustomers(List<CustomersBean> customers) {
            this.customers = customers;
        }

        public static class CustomersBean {
            @Override
            public String toString() {
                return "CustomersBean{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", phone='" + phone + '\'' +
                        ", email='" + email + '\'' +
                        '}';
            }

            /**
             * id : 1
             * name : houjianjun
             * phone : 18670801569
             * email : 474664736@qq.com
             */

            private int id;
            private String name;
            private String phone;
            private String email;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }
    }
}
