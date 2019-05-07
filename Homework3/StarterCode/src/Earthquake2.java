import java.util.LinkedList;

class Earthquake2 {
	Earthquake2() {
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

		LinkedList<MaxHzReport> maxReport = new LinkedList<MaxHzReport>();
		double largestValue = -1;
		double date = 0;
		boolean correctMonth = false;
		boolean goodData = false;

		for (int i = 0; i < data.size(); i++) {
			if (isDate(data.get(i))) {
				correctMonth = false;
				if (this.extractMonth(data.get(i)) == month) {
					correctMonth = true;
					goodData = true;
					if (largestValue >= 0) {
						maxReport.add(new MaxHzReport(date, largestValue));
					}
					date = data.get(i);
				}
			}
			
			else if (data.get(i) > largestValue && correctMonth == true) {
				largestValue = data.get(i);
			}
		}

		if (goodData == true) {
			maxReport.add(new MaxHzReport(date, largestValue));
		}

		return maxReport;
	}
}