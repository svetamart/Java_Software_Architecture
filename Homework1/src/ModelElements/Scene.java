package ModelElements;

import Stuff.Type;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int id;
    public List<PolygonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PolygonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size() > 0) {
            this.models = models;
        } else {
            throw new Exception("The scene must contain at least one model");
        }

        this.flashes = flashes;

        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("The scene must contain at least one camera");
        }

    }

    public Type method1 (Type parameter) {
        return parameter;

    }

    public Type method2 (Type parameter1, Type parameter2) {
        return parameter1;
    }



//    вариант с дженериками

    public <T> T method1 (T parameter) {
        return parameter;

    }
    public <T, E> T method2 (T parameter1, E parameter2) {
        return parameter1;
    }

}
