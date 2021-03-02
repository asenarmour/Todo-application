import React, { Component } from 'react';

class AppNav extends Component {
    state = {  }
    render() {
        return (
          <div>
            <Navbar color="dark" dark  expand="md">
              <NavbarBrand href="/">ToDo Application</NavbarBrand>
                <Nav className="ml-auto" navbar>
                  <NavItem>
                    <NavLink href="/">Home</NavLink>
                  </NavItem>
                  <NavItem>
                    <NavLink href="/users">Users</NavLink>
                  </NavItem>
                  <NavItem>
                    <NavLink href="/todo">Todo</NavLink>
                  </NavItem>
                
                </Nav>
          
            </Navbar>
          </div>
        );
      }
}
 
export default AppNav;