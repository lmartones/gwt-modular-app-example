package com.test.entites;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class CarWidget extends Composite {
	Car car;

	public CarWidget(Car car) {
		this.car = car;

		HorizontalPanel hp = new HorizontalPanel();
		hp.setSpacing(2);

		hp.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);

		Label label = new Label();
		label.setText(car.color);
		hp.add(label);

		initWidget(hp);
	}

}
