package interface_quiz;

public interface Promotion {
	default int getDiscountAmount() {
		return 0;
	}
}
