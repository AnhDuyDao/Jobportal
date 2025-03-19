# Database Configuration

## Overview
This document provides instructions for configuring the database for the project. The database used is MySQL.

## Prerequisites
- Install MySQL Server
- Install MySQL Workbench (optional, for GUI management)
- Ensure that the MySQL service is running

## Database Setup

Running Database Scripts

To set up the database schema, execute the SQL scripts in the sql-scripts folder:

1. Execute the SQL scripts

  00-create-user.sql
  
  Setup New Connection:
  
  Connection Name: jobportal
  
  Username: jobportal
  
  Then Test connection
  
  Password: jobportal
  
  Tick Save password in vault and OK
  
  Inside new connection next to Local instance MySQL80

2. Execute the SQL scripts

   01-jobportal.sql




