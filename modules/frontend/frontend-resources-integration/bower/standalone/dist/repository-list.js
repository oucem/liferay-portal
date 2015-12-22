'use strict';

function _typeof(obj) { return obj && typeof Symbol !== "undefined" && obj.constructor === Symbol ? "symbol" : typeof obj; }

define(['exports', '../bower_components/react/react', './api', './repo'], function (exports, _react, _api, _repo) {
	Object.defineProperty(exports, "__esModule", {
		value: true
	});

	var _react2 = _interopRequireDefault(_react);

	var _repo2 = _interopRequireDefault(_repo);

	function _interopRequireDefault(obj) {
		return obj && obj.__esModule ? obj : {
			default: obj
		};
	}

	function _classCallCheck(instance, Constructor) {
		if (!(instance instanceof Constructor)) {
			throw new TypeError("Cannot call a class as a function");
		}
	}

	var _createClass = (function () {
		function defineProperties(target, props) {
			for (var i = 0; i < props.length; i++) {
				var descriptor = props[i];
				descriptor.enumerable = descriptor.enumerable || false;
				descriptor.configurable = true;
				if ("value" in descriptor) descriptor.writable = true;
				Object.defineProperty(target, descriptor.key, descriptor);
			}
		}

		return function (Constructor, protoProps, staticProps) {
			if (protoProps) defineProperties(Constructor.prototype, protoProps);
			if (staticProps) defineProperties(Constructor, staticProps);
			return Constructor;
		};
	})();

	function _possibleConstructorReturn(self, call) {
		if (!self) {
			throw new ReferenceError("this hasn't been initialised - super() hasn't been called");
		}

		return call && ((typeof call === 'undefined' ? 'undefined' : _typeof(call)) === "object" || typeof call === "function") ? call : self;
	}

	function _inherits(subClass, superClass) {
		if (typeof superClass !== "function" && superClass !== null) {
			throw new TypeError("Super expression must either be null or a function, not " + typeof superClass);
		}

		subClass.prototype = Object.create(superClass && superClass.prototype, {
			constructor: {
				value: subClass,
				enumerable: false,
				writable: true,
				configurable: true
			}
		});
		if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass;
	}

	var RepositoryList = (function (_React$Component) {
		_inherits(RepositoryList, _React$Component);

		function RepositoryList(props) {
			_classCallCheck(this, RepositoryList);

			var _this = _possibleConstructorReturn(this, Object.getPrototypeOf(RepositoryList).call(this, props));

			_this.state = {
				repos: []
			};
			return _this;
		}

		_createClass(RepositoryList, [{
			key: 'componentDidMount',
			value: function componentDidMount() {
				var _this2 = this;

				(0, _api.reposForUser)('jbalsas').then(function (repos) {
					_this2.setState({
						repos: repos
					});
				});
			}
		}, {
			key: 'render',
			value: function render() {
				var repos = this.state.repos.map(function (repo) {
					return _react2.default.createElement('li', {
						key: repo.id
					}, _react2.default.createElement(_repo2.default, {
						raw: repo
					}));
				});
				return _react2.default.createElement('ul', null, repos);
			}
		}]);

		return RepositoryList;
	})(_react2.default.Component);

	exports.default = RepositoryList;
});