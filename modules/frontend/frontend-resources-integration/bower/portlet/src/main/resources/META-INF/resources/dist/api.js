"use strict";

define(["exports"], function (exports) {
	Object.defineProperty(exports, "__esModule", {
		value: true
	});

	var reposForUser = function reposForUser(username) {
		var url = "https://api.github.com/users/" + username + "/repos";
		return fetch(url).then(function (response) {
			return response.json();
		});
	};

	exports.reposForUser = reposForUser;
});