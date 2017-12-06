package com.pinger.splitshow.model;

import java.util.List;

/**
 * Created by Administrator on 2017/12/6.
 */

public class OsChina {

    /**
     * http://www.oschina.net/action/apiv2/banner?catalog=1
     * code : 1
     * message : success
     * notice : {"newsCount":22}
     * result : {"items":[{"detail":"","href":"http://t.cn/RYtMufy","id":0,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_1bc71a12-b4a6-47ce-8ada-189fb5ad4527.png","name":"码龄七年的00后码农","pubDate":"2017-11-26 23:20:20","type":0},{"detail":"","href":"http://www.oschina.net/project/top_cn_2017?from=appbanner","id":0,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_4a46dc20-01ba-4440-bae1-8ccaa167927c.jpg","name":"2017 年度最受欢迎开源软件","pubDate":"2017-11-27 11:08:06","type":0},{"detail":"","href":"https://www.oschina.net/2017-beijing-ceremony","id":0,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_e171f138-2445-4b14-97c8-4e474af8cc8f.jpg","name":"2017源创会年终盛典","pubDate":"2017-11-29 14:53:02","type":0},{"detail":"","href":"https://www.oschina.net/question/2720166_2270873","id":2270873,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_027a05aa-f5f1-45a8-b55a-9447dcd7349b.jpg","name":"和你聊聊 Selenium 自动化测试之道","pubDate":"2017-12-06 01:56:11","type":2},{"detail":"","href":"https://www.oschina.net/news/90419/parity-ethereum-wallet-vulnerability","id":90419,"img":"https://static.oschina.net/uploads/cooperation/78455/intellij-idea-2016-3-public-preview_48c94eab-4ed3-46b2-b179-488a6025efb0.jpg","name":"2.8 亿美元以太币被冻结","pubDate":"2017-11-10 17:55:09","type":6}],"nextPageToken":"61AF0C190D6BD629","prevPageToken":"3EA621243546C8A5","requestCount":5,"responseCount":5,"totalResults":5}
     * time : 2017-12-06 10:43:18
     */

    private int code;
    private String message;
    private NoticeBean notice;
    private ResultBean result;
    private String time;

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

    public NoticeBean getNotice() {
        return notice;
    }

    public void setNotice(NoticeBean notice) {
        this.notice = notice;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static class NoticeBean {
        /**
         * newsCount : 22
         */

        private int newsCount;

        public int getNewsCount() {
            return newsCount;
        }

        public void setNewsCount(int newsCount) {
            this.newsCount = newsCount;
        }
    }

    public static class ResultBean {
        /**
         * items : [{"detail":"","href":"http://t.cn/RYtMufy","id":0,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_1bc71a12-b4a6-47ce-8ada-189fb5ad4527.png","name":"码龄七年的00后码农","pubDate":"2017-11-26 23:20:20","type":0},{"detail":"","href":"http://www.oschina.net/project/top_cn_2017?from=appbanner","id":0,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_4a46dc20-01ba-4440-bae1-8ccaa167927c.jpg","name":"2017 年度最受欢迎开源软件","pubDate":"2017-11-27 11:08:06","type":0},{"detail":"","href":"https://www.oschina.net/2017-beijing-ceremony","id":0,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_e171f138-2445-4b14-97c8-4e474af8cc8f.jpg","name":"2017源创会年终盛典","pubDate":"2017-11-29 14:53:02","type":0},{"detail":"","href":"https://www.oschina.net/question/2720166_2270873","id":2270873,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_027a05aa-f5f1-45a8-b55a-9447dcd7349b.jpg","name":"和你聊聊 Selenium 自动化测试之道","pubDate":"2017-12-06 01:56:11","type":2},{"detail":"","href":"https://www.oschina.net/news/90419/parity-ethereum-wallet-vulnerability","id":90419,"img":"https://static.oschina.net/uploads/cooperation/78455/intellij-idea-2016-3-public-preview_48c94eab-4ed3-46b2-b179-488a6025efb0.jpg","name":"2.8 亿美元以太币被冻结","pubDate":"2017-11-10 17:55:09","type":6}]
         * nextPageToken : 61AF0C190D6BD629
         * prevPageToken : 3EA621243546C8A5
         * requestCount : 5
         * responseCount : 5
         * totalResults : 5
         */

        private String nextPageToken;
        private String prevPageToken;
        private int requestCount;
        private int responseCount;
        private int totalResults;
        private List<ItemsBean> items;

        public String getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        public String getPrevPageToken() {
            return prevPageToken;
        }

        public void setPrevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
        }

        public int getRequestCount() {
            return requestCount;
        }

        public void setRequestCount(int requestCount) {
            this.requestCount = requestCount;
        }

        public int getResponseCount() {
            return responseCount;
        }

        public void setResponseCount(int responseCount) {
            this.responseCount = responseCount;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * detail :
             * href : http://t.cn/RYtMufy
             * id : 0
             * img : https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_1bc71a12-b4a6-47ce-8ada-189fb5ad4527.png
             * name : 码龄七年的00后码农
             * pubDate : 2017-11-26 23:20:20
             * type : 0
             */

            private String detail;
            private String href;
            private int id;
            private String img;
            private String name;
            private String pubDate;
            private int type;

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
