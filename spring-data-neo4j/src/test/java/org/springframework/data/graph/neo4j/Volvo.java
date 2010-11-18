package org.springframework.data.graph.neo4j;

import org.neo4j.graphdb.Node;
import org.springframework.data.graph.annotation.NodeEntity;
import org.springframework.data.graph.neo4j.Car;

@NodeEntity
public class Volvo extends Car {
	public Volvo() {
	}

	public Volvo(Node n) {
		setUnderlyingState(n);
	}
}
