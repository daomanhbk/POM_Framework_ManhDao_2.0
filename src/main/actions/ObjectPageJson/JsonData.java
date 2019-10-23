
package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonData {

    @SerializedName("RegisterScript")
    @Expose
    private RegisterScript registerScript;
    @SerializedName("NewCustomer")
    @Expose
    private NewCustomer newCustomer;
    @SerializedName("EditCustomer")
    @Expose
    private EditCustomer editCustomer;

    public RegisterScript getRegisterScript() {
        return registerScript;
    }

    public void setRegisterScript(RegisterScript registerScript) {
        this.registerScript = registerScript;
    }

    public NewCustomer getNewCustomer() {
        return newCustomer;
    }

    public void setNewCustomer(NewCustomer newCustomer) {
        this.newCustomer = newCustomer;
    }

    public EditCustomer getEditCustomer() {
        return editCustomer;
    }

    public void setEditCustomer(EditCustomer editCustomer) {
        this.editCustomer = editCustomer;
    }

}
