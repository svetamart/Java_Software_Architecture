package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PolygonalModel;
import ModelElements.Scene;
import Stuff.Angle3D;
import Stuff.Point3D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PolygonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changeObservers;

    public ModelStore(List<IModelChangedObserver> changeObservers) {
        this.changeObservers = changeObservers;
        models = new ArrayList<>();
        scenes = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();

        models.add(new PolygonalModel(null));
        flashes.add(new Flash(new Point3D(0,0,0), new Angle3D(30,0,0,0),
                new Color(255,255,255), 50));
        cameras.add(new Camera(new Point3D(1,1,1), new Angle3D(58,1,1,1)));
        try {
            scenes.add(new Scene(0, models, flashes, cameras));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Scene getScene (int sceneId) {
        for (int i = 0; i < scenes.size(); i++) {
            if (sceneId == scenes.get(i).id) {
                return scenes.get(i);
            }
        }
        return null;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
