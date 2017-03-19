package graphql.schema

import graphql.AssertException
import spock.lang.Specification

import static graphql.schema.GraphQLUnionType.newUnionType

class GraphQLUnionTypeTest extends Specification {

    def "no possible types in union fails"() {
        when:
        newUnionType()
                .name("TestUnionType")
                .typeResolver(TypeResolverProxyKt.typeResolverProxy())
                .build();
        then:
        thrown(AssertException)
    }
}
