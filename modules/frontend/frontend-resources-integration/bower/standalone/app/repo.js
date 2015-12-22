import React from '../bower_components/react/react';

export default class Repo extends React.Component {
	render() {
		return (
			<div>
				<h3>{this.props.raw.name}</h3>
				<p>{this.props.raw.description}</p>
			</div>
		);
	}
}