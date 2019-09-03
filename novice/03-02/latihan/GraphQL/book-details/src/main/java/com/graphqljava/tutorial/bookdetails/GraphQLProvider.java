package bookdetails;

import java.beans.BeanProperty;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * GraphQLProvider
 */
public class GraphQLProvider {

    @Bean
    public GraphQL graphQL(){
        return graphQL;
    }

    @PostConstruct
    public void init() throws IOException{
        URL url = Resource.getResource("schema.graphqls");
        String sdl = Resource.toString(url, Charsets.UTF_8);
        GraphQLSchema graphQLSchema = buildSchema(sdl);
        this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
    }

    private GraphQLSchema buildSchema(String sdl){

    }
}