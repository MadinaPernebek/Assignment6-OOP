package com.company.buildMethod;

public class oracleOfHouseBuild implements HouseBuild{
    private House house;

       public oracleOfHouseBuild() {

            this.house = new House();
        }

        @Override
        public void buildFoundation() {
            System.out.println("The foundation is built");
            house.setFoundationType("Strip foundation");
        }

        @Override
        public void buildStatue() {
            System.out.println("No need in statue");
            house.setStatue(false);
        }

        @Override
        public void buildRooms() {
            System.out.println("Let's be modest");
            house.setRoomNumber(6);
        }

        @Override
        public void setAddress() {
            System.out.println("From 1958");
            house.setAddress("Berkshire Hathaway Inc. 3555 Farnam Street");
        }

        @Override
        public void buildGarden() {
            System.out.println("Just a little one");
            house.setGarden(true);
        }

        @Override
        public void buildPool() {
            System.out.println("Pool is kinda useless");
            house.setPool(false);
        }

        @Override
        public void setArea() {
            System.out.println("No need in big mansion");
            house.setArea(200);
        }

        @Override
        public void buildFloor() {
            System.out.println("2 floors in enough");
            house.setFloors(2);
        }

        @Override
        public House getHouse(){
            System.out.println("Pretty enough for billionaire");
            return house;
        }
}
