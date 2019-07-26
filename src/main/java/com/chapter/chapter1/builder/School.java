package com.chapter.chapter1.builder;

public class School {
    private final String name;
    private final String location;
    private final int id;
    private School (SchoolBuilder builder){
        this.name = builder.name;
        this.location = builder.location;
        this.id = builder.id;
    }
    public static class SchoolBuilder implements Builder<School>{
        private  String name;
        private  String location;
        private  int id;

        public SchoolBuilder setName(String name){
            this.name = name; return this;
        }
        public SchoolBuilder setLocation(String location){
            this.location = location; return this;
        }
        public SchoolBuilder setId(int id){
            this.id = id; return this;
        }
        public School build(){
            return new School(this);
        }
    }

}
