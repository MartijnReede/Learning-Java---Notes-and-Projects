module MatrixLetters {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
	requires javafx.graphics;
    opens MatrixLetters.Visual to javafx.fxml;
    exports MatrixLetters.Visual;
}