var gulp = require('gulp');
var babel = require('gulp-babel');
var modulesAmd = require('babel-plugin-transform-es2015-modules-amd');

gulp.task('default', function() {
	return gulp.src('app/**/*.js')
		.pipe(babel({
			plugins: [modulesAmd],
			presets: ['es2015', 'react']
		}))
		.pipe(gulp.dest('dist'))
});