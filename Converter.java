import java.util.Converter;

abstract class Converter {
    abstract double convert(double value);
}

class CurrencyConverter extends Converter {

    public double dollarToINR(double dollars) {
        return dollars * 83.0;
    }

    public double euroToINR(double euros) {
        return euros * 90.0;
    }

    public double yenToINR(double yen) {
        return yen * 0.60;
    }

    public double inrToDollar(double inr) {
        return inr / 83.0;
    }

    public double inrToEuro(double inr) {
        return inr / 90.0;
    }

    public double inrToYen(double inr) {
        return inr / 0.60;
    }

    @Override
    double convert(double value) {
        return value;
    }

    class DistanceConverter extends Converter {

        public double metersToKm(double meters) {
            return meters / 1000;
        }

        public double milesToKm(double miles) {
            return miles * 1.60934;
        }

        public double kmToMeters(double km) {
            return km * 1000;
        }

    @Override
    double convert(double value) {
        return value; s
    }
    }

    class TimeConverter extends Converter {

        public double hoursToMinutes(double hours) {
            return hours * 60;
        }

        public double minutesToHours(double minutes) {
            return minutes / 60;
        }

        public double secondsToMinutes(double seconds) {
            return seconds / 60;
        }

        public double minutesToSeconds(double minutes) {
            return minutes * 60;
        }

        @Override
        double convert(double value) {
            return value;
        }
    }

public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        System.out.println("100 Dollars to INR: " + currencyConverter.dollarToINR(100));
        System.out.println("100 Euros to INR: " + currencyConverter.euroToINR(100));
        System.out.println("100 Yen to INR: " + currencyConverter.yenToINR(100));

        DistanceConverter distanceConverter = new DistanceConverter();
        System.out.println("1000 Meters to KM: " + distanceConverter.metersToKm(1000));
        System.out.println("1 Mile to KM: " + distanceConverter.milesToKm(1));

        TimeConverter timeConverter = new TimeConverter();
        System.out.println("2 Hours to Minutes: " + timeConverter.hoursToMinutes(2));
        System.out.println("120 Seconds to Minutes: " + timeConverter.secondsToMinutes(120));
    }
}
