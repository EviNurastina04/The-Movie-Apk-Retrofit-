package com.themovie.androidretrofit;

import kt.util.List;
//View model disini digantikan menjadi mainmodel dimana main model juga hampir sama fungsinya yaitu dapat memproses hasil build dari 
//apk dimana menghasilkan beberapa list
public class MainModel {

    private List<Result> result;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result {

        private int id;
        private String title;
        private String image;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", image='" + image + '\'' +
                    '}';
        }
    }
}
