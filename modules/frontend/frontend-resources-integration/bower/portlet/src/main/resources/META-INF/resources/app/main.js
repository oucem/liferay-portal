import '../bower_components/fetch/fetch';

import React from '../bower_components/react/react';
import ReactDOM from '../bower_components/react/react-dom';

import { reposForUser} from './api';

import RepositoryList from './repository-list';

class HelloWorld extends React.Component {
	render() {
		return (
			<div>
				<h2>Repos</h2>
				<RepositoryList />
			</div>
		);
	}
}

var renderDemo = function() {
	ReactDOM.render(<HelloWorld />, document.getElementById('bowerPortletDemo'));
};

export {renderDemo}