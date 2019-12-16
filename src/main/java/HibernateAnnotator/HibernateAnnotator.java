package HibernateAnnotator;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;
import org.jsonschema2pojo.AbstractAnnotator;
import org.jsonschema2pojo.Jackson2Annotator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public class HibernateAnnotator extends AbstractAnnotator {

    public static void main(String[] args){
        //property
    }

    @Override
    public void propertyField(JFieldVar field, JDefinedClass clazz, String propertyName, JsonNode propertyNode) {
        super.propertyField(field, clazz, propertyName, propertyNode);

        // Note: does not have to be the propertyName, could be the field or propertyNode that is verified.
        if (propertyName.equals("entity")) {
            clazz.annotate(Entity.class);
            clazz.annotate(Table.class);
        }

        field.annotate(Column.class);
    }
}
