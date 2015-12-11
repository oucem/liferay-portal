import 'fetch';

import React from 'react';
import ReactDOM from 'react-dom';

import { eposForUser} from './api';

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

ReactDOM.render(<HelloWorld />, document.body);