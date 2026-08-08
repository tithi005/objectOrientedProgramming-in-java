class price{
    public static void main(String args[]){
        if(args.length<1){
            System.out.println("Please provide the price through commnadline argument");
        }
        else{
            double rupee = Double.parseDouble(args[0]);
            System.out.println("Price in Rupees: " + rupee);
            int paise = (int)(rupee*100);
            System.out.println("Price in Paise: " + paise);
        }
    }
}