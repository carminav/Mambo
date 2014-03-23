package com.example.Mambo;

/**
 * Created by Sruti on 3/22/14.
 */


public class Post {
        public static Post postToBeSent;

        private String address;
        private String city;
        private String state;
        private String zipcode;
        private double longitude;
        private double latitude;
        private String title;
        private String content;
        private String user;
        private String endTime;
        private String blurb;
        private String category;

    public Post(String address, String city, String state, String zipcode, String title, String content, String user, String endTime, String blurb, String category){
        this.address=address;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;
        this.title=title;
        this.content=content;
        this.user=user;
        this.endTime=endTime;
        this.blurb=blurb;
        this.category=category;

    }

/*
* With address: we need to determine if the particular city exists within the particular state, and then within
* that we can examine if the road exists, and then determine if the number of the house exists on that road.
* If everything is right until the road, then have to modify the marker -- model based off geoposition?
*/

        public String getblurb(){
            String blurb = "";
            for (int i =0; i < 30; i++){
                if (content.length() > i){
                    blurb = blurb + content.substring(i, i+1);
                }
            }
            return blurb;
        }

        public String getCategory(){
            return category;
        }

        public void setCategory(String category){
            this.category = category;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;

//need to determine somehow if the address given is does not exist according to maps/GPS
//throw runtime exception and then re ask the user for an address
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPost_statement() {
            return content;
        }

        public void setPost_statement(String content) {
            this.content = content;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {

            this.endTime = endTime;

       }
}
