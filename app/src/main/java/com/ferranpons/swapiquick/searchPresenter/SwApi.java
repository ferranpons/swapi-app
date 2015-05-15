package com.ferranpons.swapiquick.searchPresenter;

public class SwApi {
	public static SwApiSearchInterface getSwApi(String endPoint) {
		RestAdapter restAdapter =
			new RestAdapter.Builder()
				.setEndpoint(endPoint)
				.build();

		return restAdapter.create(SwApiSearchInterface.class);
	}
}
