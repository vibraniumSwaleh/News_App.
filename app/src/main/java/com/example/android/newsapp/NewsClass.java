package com.example.android.newsapp;

public class NewsClass {

        //Method variables
        private String newsTitle;
        private String sectionName;
        private String newsDate;
        private String newsURL;

        //Class constructor
        public NewsClass(String title, String section, String date, String url){
            newsTitle = title;
            sectionName = section;
            newsDate = date;
            newsURL = url;
        }

        //method to get magnitude
        public String getNewsTitle(){
            return newsTitle;
        }

        //method to get location
        public String getSectionName(){
            return sectionName;
        }

        //method to get date
        public String getNewsDate(){
            return newsDate;
        }

        //method to get url
        public String getNewsURL(){
            return newsURL;
        }
    }

