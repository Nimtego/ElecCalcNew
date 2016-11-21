package Operation;
import  ProgrammInterface.IAction;
/**
 * Created by nimtego_loc on 18.11.2016.
 */
public abstract class ObjOperation implements IAction {
    private String name;
    private String type;

    public ObjOperation(final String name, final String type) {
        this.name = name;
        this.type = type;
    }
    final public void setName(final String name) {
        this.name = name;
    }
    final public void setType(final String type) {
        this.type = type;
    }
    final public String getName() {
        return name;
    }
    final public String getType() {
        return type;
    }
    public String toString() {
        return name +" " +type;
    }

    @Override
    abstract public void menuAction();
}
