import React, { Component } from 'react';

class User extends Component {
    state = {  
        isLoading:true,
        user:[]
    }

    async componentDidMount(){
        const response=await fetch("/api/v1/users/")
        const body = response.json();
        this.setState({user:body,isLoading:false});
    }

    render() { 
        const {isLoading,user}=this.state;
        if(isLoading)
            return(<div>Loading....</div>);
        return (  
            <div>
                <AppNav/>

            </div>

        );
    }
}
 
export default User;