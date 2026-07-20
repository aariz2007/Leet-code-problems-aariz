class ParkingSystem {

    int big;
    int medium;
    int small;

    // Constructor
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    // Method to park a car
    public boolean addCar(int carType) {

        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            }
            return false;
        }

        if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            }
            return false;
        }

        if (carType == 3) {
            if (small > 0) {
                small--;
                return true;
            }
            return false;
        }

        return false;
    }
}
