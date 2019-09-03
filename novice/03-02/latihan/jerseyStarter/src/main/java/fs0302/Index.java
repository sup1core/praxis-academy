package fs0302;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Index {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String index() {
        return "[{'message': 'welcome'}]";
    }
}
