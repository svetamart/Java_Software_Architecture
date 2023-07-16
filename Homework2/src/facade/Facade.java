package facade;

import facade.components.CLR;
import facade.components.Compiller;
import facade.components.TextEditor;

public class Facade {

    private TextEditor textEditor;
    private Compiller compiller;
    private CLR clr;

    public Facade(TextEditor textEditor, Compiller compiller, CLR clr) {
        this.textEditor = textEditor;
        this.compiller = compiller;
        this.clr = clr;
    }

    public void start()
    {
        textEditor.createCode();
        textEditor.save();
        compiller.compile();
        clr.execute();
    }
    public void stop()
    {
        clr.finish();
    }
}
