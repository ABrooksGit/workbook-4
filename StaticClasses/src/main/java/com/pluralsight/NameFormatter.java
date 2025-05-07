package com.pluralsight;

public class NameFormatter {

    private String firstName;

    private String lastName;

    private String middleName;

    private String prefix;

    private String suffix;


    private NameFormatter() {}

    public static String format(String firstName,
                                String lastName){


      return String.format(firstName + " " +  lastName);



    }







    public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix){

        String addTo = "";

        addTo += prefix + ". ";
        addTo += firstName + " ";
        addTo += middleName + " ";
        addTo += lastName + ", ";
        addTo += suffix + " ";

        return addTo;






    }





    public static String format(String fullName){

        String prefix = "";
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String suffix = "";



        String [] names = fullName.split("," , 2);

        String namePart = names[0].trim();

        prefix = names[0];
        firstName = names[1];


        if(names.length > 1){
            suffix = names[0].trim();
        }

        String[] parts = namePart.split(" ");


        if(names.length ==4){
            prefix = parts[0];
            firstName = parts[1];
            middleName = parts[2];
            lastName = names[3];
        } else if(names.length == 3) {
            firstName = parts[0];
            middleName = names[1];
            lastName = names[2];
        } else if(names.length == 2){
            firstName = parts[0];
            lastName = parts[1];
        }



        return  String.format(fullName);





    }




}
