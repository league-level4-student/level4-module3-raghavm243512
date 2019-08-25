package _01_introduction;

class CustomException extends Exception {
	public void terminate() {
		System.exit(0);
	}
	
}
