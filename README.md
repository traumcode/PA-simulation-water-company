# PA-simulation-water-company

Smart water management

A water management company wants to modernize itself by installing smart water meters for its customers. Before it can do that, it must migrate all it's paper based infrastructure to a digital one.

Each month, the company has a different water rate (how much a "unit" of water costs). 

The company has multiple clients and each client has multiple consumption places. A client is defined by a name, a billing address, and bank account. Depending on the client type it also has a different discount rate (15% for business clients, 0% for residential). Each customer is also interested in knowing what he has to pay for the last month, based on a rate he receives from the water company.

A consumption place is defined by an address and has one or more water meters.

The company has two types of water meters. All water meter types have an unique identifier and a starting index. Each water meter can report the consumption over the last month. Additionally, water meters may be able to indicate that a leak has been detected.

Type one water meters report that a leak was detected if the consumption is over 25.
Type two water meters reports are not able to detect leaks.

As the water management company we are interested in the following reports:

Get all the water meters that have leaks.
Get the top 3 clients with the biggest bills over the last month.
