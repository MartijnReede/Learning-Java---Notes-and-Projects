module MasterMind {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
	requires javafx.graphics;
    opens MasterMind.MasterMind to javafx.fxml;
    exports MasterMind.MasterMind;
}