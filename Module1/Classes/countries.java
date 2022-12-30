package Module1.Classes;
class countries {

    public static class Country{
        int population;
        String name;
        String language;


        public String printLanguage(){
            return "Here in " + name + " we speak " + language;
        }

        public void printMessage(){
            System.out.println("I am a citizen of the world");

        }

    }

    public static class France extends Country{

        @Override
        public void printMessage(){
            System.out.println("I am a french person");
        }


    }

    public static void main(String[] args){

        Country country1 = new Country();
        Country country2 = new France();

        country1.printMessage();
        country2.printMessage();

    }

}
