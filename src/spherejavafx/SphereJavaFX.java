//Page 391 in the JavaFX Textbook
package spherejavafx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;


public class SphereJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage){
       
        StackPane root = new StackPane();
        
        //root.getChildren().add(btn);
        Scene scene = new Scene(root, 1000, 1000);
        PerspectiveCamera camera = new PerspectiveCamera(true);
        
        //Backs the camera away from the scene by 1000 units
        camera.setTranslateZ(-4000);
        
        //This is the range of which the camera will render objects
        camera.setNearClip(0.1);
        camera.setFarClip(6000.0);
        
        //The default field of view for the scene is 30 but change to suit
        camera.setFieldOfView(30);
        scene.setCamera(camera);
        
        //This sets up my sphere
        Sphere mysphere = new Sphere(350);
        mysphere.setTranslateX(-175);
        mysphere.setTranslateY(-175);
        mysphere.setTranslateZ(100);
        root.getChildren().add(mysphere);
        
        Sphere mysphere2 = new Sphere(350);
        mysphere2.setTranslateX(-900);
        mysphere2.setTranslateY(-900);
        mysphere2.setTranslateZ(100);
        root.getChildren().add(mysphere2);
        
        Sphere mysphere3 = new Sphere(350);
        mysphere3.setTranslateX(-175);
        mysphere3.setTranslateY(-900);
        mysphere3.setTranslateZ(100);
        root.getChildren().add(mysphere3);
        
        Sphere mysphere4 = new Sphere(350);
        mysphere4.setTranslateX(-900);
        mysphere4.setTranslateY(-175);
        mysphere4.setTranslateZ(100);
        root.getChildren().add(mysphere4);
        
        Sphere mysphere5 = new Sphere(350);
        mysphere5.setTranslateX(-537);
        mysphere5.setTranslateY(-900);
        mysphere5.setTranslateZ(100);
        root.getChildren().add(mysphere5);
        
        Sphere mysphere6 = new Sphere(350);
        mysphere6.setTranslateX(-537);
        mysphere6.setTranslateY(-175);
        mysphere6.setTranslateZ(100);
        root.getChildren().add(mysphere6);
        
        Sphere mysphere7 = new Sphere(350);
        mysphere7.setTranslateX(-175);
        mysphere7.setTranslateY(-537);
        mysphere7.setTranslateZ(100);
        root.getChildren().add(mysphere7);
        
        Sphere mysphere8 = new Sphere(350);
        mysphere8.setTranslateX(-900);
        mysphere8.setTranslateY(-537);
        mysphere8.setTranslateZ(100);
        root.getChildren().add(mysphere8);
        
        Sphere mysphere9 = new Sphere(350);
        mysphere9.setTranslateX(-537);
        mysphere9.setTranslateY(-537);
        mysphere9.setTranslateZ(100);
        root.getChildren().add(mysphere9);
        
        //This sets up the image of the earth to wrap around my sphere
        Image sonicImage = new Image("File:sonic.jpg");
        PhongMaterial sonicPhong = new PhongMaterial();
        sonicPhong.setDiffuseMap(sonicImage);
        mysphere.setMaterial(sonicPhong);
        mysphere2.setMaterial(sonicPhong);
        mysphere3.setMaterial(sonicPhong);
        mysphere4.setMaterial(sonicPhong);
        mysphere5.setMaterial(sonicPhong);
        mysphere6.setMaterial(sonicPhong);
        mysphere7.setMaterial(sonicPhong);
        mysphere8.setMaterial(sonicPhong);
        mysphere9.setMaterial(sonicPhong);
        
        
        //This rotates my sphere

        RotateTransition rotate = new RotateTransition();
        rotate.setNode(mysphere);
        rotate.setDuration(Duration.millis(100));
        rotate.setAxis(Rotate.Y_AXIS);
        rotate.setByAngle(-360);
        rotate.setCycleCount(Animation.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.play();
        
        
        RotateTransition rotate2 = new RotateTransition();
        rotate2.setNode(mysphere2);
        rotate2.setDuration(Duration.millis(100));
        rotate2.setAxis(Rotate.Y_AXIS);
        rotate2.setByAngle(-360);
        rotate2.setCycleCount(Animation.INDEFINITE);
        rotate2.setInterpolator(Interpolator.LINEAR);
        rotate2.play();
        
        RotateTransition rotate3 = new RotateTransition();
        rotate3.setNode(mysphere3);
        rotate3.setDuration(Duration.millis(100));
        rotate3.setAxis(Rotate.Y_AXIS);
        rotate3.setByAngle(-360);
        rotate3.setCycleCount(Animation.INDEFINITE);
        rotate3.setInterpolator(Interpolator.LINEAR);
        rotate3.play();
        
        RotateTransition rotate4 = new RotateTransition();
        rotate4.setNode(mysphere4);
        rotate4.setDuration(Duration.millis(100));
        rotate4.setAxis(Rotate.Y_AXIS);
        rotate4.setByAngle(-360);
        rotate4.setCycleCount(Animation.INDEFINITE);
        rotate4.setInterpolator(Interpolator.LINEAR);
        rotate4.play();
        
        RotateTransition rotate5 = new RotateTransition();
        rotate5.setNode(mysphere5);
        rotate5.setDuration(Duration.millis(100));
        rotate5.setAxis(Rotate.Y_AXIS);
        rotate5.setByAngle(-360);
        rotate5.setCycleCount(Animation.INDEFINITE);
        rotate5.setInterpolator(Interpolator.LINEAR);
        rotate5.play();
        
        RotateTransition rotate6 = new RotateTransition();
        rotate6.setNode(mysphere6);
        rotate6.setDuration(Duration.millis(100));
        rotate6.setAxis(Rotate.Y_AXIS);
        rotate6.setByAngle(-360);
        rotate6.setCycleCount(Animation.INDEFINITE);
        rotate6.setInterpolator(Interpolator.LINEAR);
        rotate6.play();
        
        RotateTransition rotate7 = new RotateTransition();
        rotate7.setNode(mysphere7);
        rotate7.setDuration(Duration.millis(100));
        rotate7.setAxis(Rotate.Y_AXIS);
        rotate7.setByAngle(-360);
        rotate7.setCycleCount(Animation.INDEFINITE);
        rotate7.setInterpolator(Interpolator.LINEAR);
        rotate7.play();
        
        RotateTransition rotate8 = new RotateTransition();
        rotate8.setNode(mysphere8);
        rotate8.setDuration(Duration.millis(100));
        rotate8.setAxis(Rotate.Y_AXIS);
        rotate8.setByAngle(-360);
        rotate8.setCycleCount(Animation.INDEFINITE);
        rotate8.setInterpolator(Interpolator.LINEAR);
        rotate8.play();
        
        RotateTransition rotate9 = new RotateTransition();
        rotate9.setNode(mysphere9);
        rotate9.setDuration(Duration.millis(100));
        rotate9.setAxis(Rotate.Y_AXIS);
        rotate9.setByAngle(-360);
        rotate9.setCycleCount(Animation.INDEFINITE);
        rotate9.setInterpolator(Interpolator.LINEAR);
        rotate9.play();
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
