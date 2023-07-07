package ModelElements;

import Stuff.Type;

import java.util.List;

public class Scene {
    public int id;
    public List<PolygonalModel> models;
    public List<Flash> flashes;

    public Scene(int id, List<PolygonalModel> models, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public Type method1 (Type parameter) {
        return new Type();

    }

    public Type method12 (Type parameter1, Type parameter2) {
        return new Type();
    }

}
