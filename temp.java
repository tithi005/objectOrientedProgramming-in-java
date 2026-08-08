class temp{
    public static void main(String args[]){
        if(args.length<1){
            System.out.println("Please provide the temperature through command line argument");
        }
        else{
            double celsius = Double.parseDouble(args[0]);
            System.out.println("Temperature in Celsius: " + celsius);
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        }
    }
}