var del = require('del');
var gulp = require('gulp');
var gutil = require('gutil');
var path = require('path');
var runSequence = require('run-sequence');
var webpack = require('webpack');

gulp.task('webpack', function(callback) {
	webpack({
		entry: {
			app: './app/main.js',
			vendor: ['react', 'react-dom', 'whatwg-fetch']
		},
		output: {
			path: path.join(__dirname, 'dist'),
			filename: '[name].bundle.js'
		},
		module: {
			context: path.join(__dirname, 'node_modules'),
			loaders: [
				{
					test: /\.js$/,
					exclude: /(node_modules)/,
					loader: 'babel',
					query: {
						presets: ['react', 'es2015']
					}
				}
			]
		}
	}, function(err) {
		if (err) {
			throw new gutil.PluginError('webpack', err);
		}

		callback();
	}, callback);
});

gulp.task('clean', function(callback) {
	del('./dist')
		.then(function() {
			callback();
		})
});

gulp.task('default', function(callback) {
	runSequence('clean', 'webpack', callback)
});