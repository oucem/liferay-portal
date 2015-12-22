;(function() {
	var PATH_BOWER_PORTLET = Liferay.ThemeDisplay.getPathContext() + '/o/frontend-resources-integration-bower-web';

	Loader.addModule(
		{
			dependencies: [],
			exports: 'fetch',
			name: 'bower_standalone@1.0.0/bower_components/fetch/fetch',
			path: PATH_BOWER_PORTLET + '/bower_components/fetch/fetch.js'
		}
	);

	Loader._config.maps.react = 'bower_standalone@1.0.0/bower_components/react/react';
})();