import java.util.LinkedList;

class Earthquake1 {
	Earthquake1() {
	}

	// checks whether a datum is a date
	boolean isDate(double anum) {
		return (int) anum > 10000000;
	}

	// extracts the month from an 8-digit date
	int extractMonth(double dateNum) {
		return ((int) dateNum % 10000) / 100;
	}

	public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {
		double day = 0;
		double dayMax = -1; // set baseline to determine if the MaxHzReport can be used
		LinkedList<MaxHzReport> reportList = new LinkedList<MaxHzReport>();

		for (double dataPart : data) {
			if (isDate(dataPart) == true) { // Is a date
				if (day != 0 && dayMax != -1) { // Previously had a day with a max
					MaxHzReport max = new MaxHzReport(day, dayMax);
					reportList.add(max);
				}
				
				if (extractMonth(dataPart) == month) { // Is correct month given
					day = dataPart;
					dayMax = -1;
				} else { // not correct month
					day = 0;
				}
			}

			else { // Is data

				if (day != 0) { // is day in that month
					if (dataPart > dayMax) {
						dayMax = dataPart;
					}
				}

			}

		}

		if (day != 0 && dayMax != -1) {
			MaxHzReport max = new MaxHzReport(day, dayMax);
			reportList.add(max);
		}

		return reportList;
	}
}
