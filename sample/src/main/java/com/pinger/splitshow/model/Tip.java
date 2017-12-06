package com.pinger.sample.model;

/**
 * Created by Administrator on 2017/12/6.
 */

public class Tip {

    /**
     * code : 200
     * data : {"info":"좋은 아침입니다. 즐거운 하루 보내세요.좋은 아침입니다. 즐거운 하루 보내세요.좋은 아침입니다.","token":"xxx","next":"xxx","pre":"xxx"}
     */

    private int code;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * info : 좋은 아침입니다. 즐거운 하루 보내세요.좋은 아침입니다. 즐거운 하루 보내세요.좋은 아침입니다.
         * token : xxx
         * next : xxx
         * pre : xxx
         */

        private String info;
        private String token;
        private String next;
        private String pre;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }

        public String getPre() {
            return pre;
        }

        public void setPre(String pre) {
            this.pre = pre;
        }
    }
}
