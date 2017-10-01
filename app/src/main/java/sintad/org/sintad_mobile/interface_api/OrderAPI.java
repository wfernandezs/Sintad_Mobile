package sintad.org.sintad_mobile.interface_api;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import sintad.org.sintad_mobile.model.Route;
import sintad.org.sintad_mobile.model.ServiceOrder;

/**
 * Created by TTR on 21/09/2017.
 */

public interface OrderAPI {
    @GET("/service_order/getList/{id_empleado}")
    Call<List<ServiceOrder>> getList(@Path("id_empleado") int id_empleado);

    @GET("/service_order_deta/getRoute/{id_order}")
    Call<List<Route>> getRouteList(@Path("id_order") String id_order);
}
