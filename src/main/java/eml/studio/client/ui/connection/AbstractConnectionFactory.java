/**
 * Copyright 2017 Institute of Computing Technology, Chinese Academy of Sciences.
 * Licensed under the terms of the Apache 2.0 license.
 * Please see LICENSE file in the project root for terms
 */
package eml.studio.client.ui.connection;

import eml.studio.client.controller.DiagramController;
import eml.studio.client.ui.widget.shape.Shape;

public abstract class AbstractConnectionFactory {

	/**
	 * Build a connection from shape start to end
	 * @return the built connection
	 */
	public abstract Connection buildConnection(DiagramController controller,
                                             Shape start, Shape end);
}
