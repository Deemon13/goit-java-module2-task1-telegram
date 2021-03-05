class MoonRobotVespenGasDetector {
    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid) {
        return acidValue >= minAcid && acidValue <= maxAcid;
    }

    public boolean isDensityOk(int density) {
        return (density >= 1000 && density <= 5000) || (density >= 10000 && density <= 15000);
    }

    public boolean isTemperatureOk(boolean cold) {
        return !cold;
    }

    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold) {
        return isAcidOk(acidValue, minAcid, maxAcid) == true && isDensityOk(density) == true && isTemperatureOk(cold) == true;
    }

    public static void main(String[] args) {
        MoonRobotVespenGasDetector gasDetector = new MoonRobotVespenGasDetector();

        //Should be true
        System.out.println("gasDetector.isAcidOk(100, 50, 150) = " + gasDetector.isAcidOk(100, 50, 150));

        //Should be true
        System.out.println("gasDetector.isDensityOk(1500) = " + gasDetector.isDensityOk(1500));
        //Should be false
        System.out.println("gasDetector.isDensityOk(6000) = " + gasDetector.isDensityOk(6000));

        //Should be true
        System.out.println("gasDetector.isTemperatureOk(false) = " + gasDetector.isTemperatureOk(false));

        //Should be false
        System.out.println("gasDetector.isGroundOkForVespenGas(120, 75, 150, 7500, false) = " + gasDetector.isGroundOkForVespenGas(120, 75, 150, 7500, false));
        //Should be true
        System.out.println("gasDetector.isGroundOkForVespenGas(120, 75, 150, 3000, false) = " + gasDetector.isGroundOkForVespenGas(120, 75, 150, 3000, false));
    }
}
