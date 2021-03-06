
package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AbstractJson {

    @SerializedName("payment")
    @Expose
    private Payment payment;
    @SerializedName("NewCustomer")
    @Expose
    private NewCustomer newCustomer;
    @SerializedName("EditCustomer")
    @Expose
    private EditCustomer editCustomer;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
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
