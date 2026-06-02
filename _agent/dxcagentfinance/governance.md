---
layout: product-content
header: DXC Agent for Finance in D365 FSCM
toc: true
---

# Governance

Finance AI agent operates in a financially sensitive process, so governance needs to cover not only AI risks but also accounting, financial controls, auditability, security, and regulatory compliance.

Key governance areas include:

## 1. Clear Ownership and Accountability

Define who is responsible for:

- Business process ownership (Finance/Accounting)
- AI model ownership
- Technology operations
- Risk management
- Compliance oversight
- Internal audit review

A common model is:

Area                    | Owner
:--                     |:--
Reconciliation policy	  | Finance Controller
AI agent configuration  |	Finance Operations
Model governance	      | AI Governance Committee
Technical platform	    | IT
Compliance controls	    | Risk & Compliance
Independent review	    | Internal Audit


## 2. Human-in-the-Loop Controls

The AI should not have unrestricted authority over financial records.

Typical controls:

**Low-risk actions**
- Match transactions with high confidence
- Categorize standard exceptions
- Suggest explanations

Can often be auto-approved.

**Medium-risk actions**
- Propose adjustments
- Resolve exceptions

Require reviewer approval.

**High-risk actions**
- Post journal entries
- Write off balances
- Modify reconciliation rules
- Change accounting treatment

Require formal human authorization.

## 3. Model Governance

Treat the AI model similarly to other regulated bank models.

Controls include:
- Model inventory
- Version control
- Validation before production
- Periodic revalidation
- Performance monitoring
- Drift detection
- Retirement process

Document:
- Training methodology
- Data sources
- Assumptions
- Known limitations
- Approval history

## 4. Explainability Requirements

Every reconciliation decision should be explainable.

The AI should record:
- Transactions reviewed
- Matching logic used
- Confidence score
- Rules applied
- Supporting evidence
- Alternative matches considered

An auditor should be able to understand why the AI made a recommendation.

## 5. Audit Trail and Logging

Comprehensive audit logging is critical.

Capture:
- User actions
- AI recommendations
- Approvals/rejections
- Data accessed
- Configuration changes
- Model version used
- Timestamp
- Exception handling

Logs should be immutable and retained according to record-retention requirements.

## 6. Data Governance

Financial data requires strong controls.

Requirements:
- Data quality standards
- Data lineage
- Source system validation
- Reconciliation completeness checks
- Master data management
- Data retention policies

The AI should not reconcile against unverified source data.

## 7. Access Management

Apply segregation of duties.

Examples:

Function                | Should be separate from
:--                     |:--
AI rule creation	      | AI approval
Reconciliation preparation	| Reconciliation approval
System administration	| Financial approval
Model deployment	    | Model validation

Implement:
- Role-based access control
- Least privilege access
- Multi-factor authentication
- Periodic access reviews

## 8. Risk Management Framework

Assess risks such as:

Financial Risk
- Incorrect matching
- Missed exceptions
- Misstated balances

Operational Risk
- System outages
- Processing failures

AI Risk
- Hallucinations
- False confidence
- Model drift

Regulatory Risk
- Recordkeeping failures
- Inadequate controls

Maintain a risk register with mitigating controls.

## 9. Exception Management

Governance should define:
- Confidence thresholds
- Escalation paths
- Materiality thresholds
- Review SLAs
- Unresolved item procedures

Example:

Confidence    | Action
:--           |:--
>99%	        | Auto-match
90–99%	      | Reviewer queue
<90%	        | Manual investigation

## 10. Regulatory and Compliance Alignment

Depending on jurisdiction, governance should align with:
- Banking prudential requirements
- Financial reporting controls
- Operational risk frameworks
- Privacy regulations
- AI governance requirements

## 11. AI-Specific Governance

Additional controls beyond traditional reconciliation systems:

Prompt Governance
- Approved prompts
- Prompt change management
- Prompt testing

Guardrails
- Restricted actions
- Approved workflows
- Validation rules

Output Validation
- Rule-based verification
- Reconciliation balancing checks
- Threshold controls

Monitoring
- Accuracy metrics
- Override rates
- False match rates
- User feedback trends

## 12. Change Management

Any change to:
- Models
- Prompts
- Matching rules
- Thresholds
- Data feeds

Should require:
1. Testing
2. Approval
3. Documentation
4. Deployment controls
5. Post-implementation review


## Example Governance Model

For a production bank reconciliation AI agent, a strong governance structure would require:

### Level 1: Automated Controls

- Matching rules
- Confidence thresholds
- Balance checks

### Level 2: Human Review

- Exception approval
- Material item review
- Adjustment approval

### Level 3: Independent Oversight

- Risk review
- Compliance review
- Internal audit testing

### Level 4: Management Reporting

- Accuracy metrics
- Exception trends
- Override statistics
- Control breaches

A useful principle is that the AI should be treated as a preparer or analyst, not as the final approver of financial records. Final accountability for reconciliations and financial reporting should remain with authorized finance personnel.

# Governance in DXC Agent for Finance

### Level 1: Automated controls

The following automated controls are availabe in DXC Agent for Bank reconciliation:
- **Cash and bank management parameters**
    -  **Validate date difference between statement lines and bank documents during bank reconciliation process** - The agent will only match bank statements to bank documents that fall within the allowed date difference if this setting is set to _Yes_.
    -  **Validate transaction type mapping** - The agent will apply this restriction if set to _Yes_.
    -  **Agent or workflow id** - Provides the ability to run multiple licensed agents in a specific order. For example where you want the agent to match and thereafter create new transactions. This field is also available on the Bank account, if not assigned on Bank account, the agent/workflow assigned here would apply. If not assigned on the parameters, the default 'DXCAgentForBankReconciliation & DXCAgentForBankReconciliationValidation' will be run.
    -  **Agent historical reference period** - Specifies how many months of historical data the agent can use during its run when creating new voucher transactions.
- **Bank accounts**
  - **Allowed penny difference** - The agent only matches one-to-one bank statement transactions to bank transactions where the amount variance falls within the allowed penny difference for the bank account when the bank reconciliation was created.
  - **Run reconciliation agent** - This setting allows users to automatically run agent/workflow with 'Reconcile after import'. If the bank account has a 'Default matching rule set' assigned, this set will be run first and thereafter the agent/workflow.
  - **Agent or workflow id** - Provides the ability to run multiple licensed agents in a specific order. For example where you want the agent to match first and thereafter create new transactions. 
  - **Customer payment journal posting** - The Agent for Customer Payment Journal Generation will leave the created customer payment journal unposted where this field is set to _No_, which is then available for Human review for manual posting.
- **Bank transaction types** - Assign the applicable "new transaction" action to each Bank transaction type, this limits which bank statement records are included in each "new transaction" run.
- **All agents**
    - **Enabled** - The agent functionality is only available to users where this field is set to _Yes_.
    - **Agent output format** - This field is automatically populated per agent and not editable by power users, as a specific output format is expected by the agent.
    - **Knowledge sources** - The Agent for Customer Payment Journal Generation will look for values matching the set criteria, for example Invoice format.
- **Agent workflows**
    - Ability to set order of agents to be run if the bank account is set to automatically run with Reconcile after import .
- **Bank reconciliation Worksheet**
    - The agent buttons are only enabled for users where the specific agents are enabled.
    - A Prompt option is available to limit what bank statement records can be used in the matching, for example 'Only match where amount is less than 1500'.

> Note: "New transaction" are the actions that create a new bank transaction: Generate voucher, Generate customer payment, Settle customer invoice and Generate vendor payment.

### Level 2: Human Review

The following human review options are available in DXC Agent for Bank reconciliation:

- **Bank accounts**
    - **Customer payment journal posting** - The Agent for Customer Payment Journal Generation will leave the created customer payment journal unposted where this field is set to _No_, which is then available for Human review.
- **Bank reconciliation**
    - **Matched transactions** - Where the agent matched or posted a new transaction the following are available for human review:
        -  **Matching rule** - 'DXCAgent' is assigned to easily identify which records where matched/posted by the agent/s.
        -  **Matching type** - The applicable matching type is automatically assigned, for example 'Match with bank document', 'Generate voucher', 'Generate customer payment' or 'Generate vendor payment'. This makes it easier for human to determine if the agent matched or generated a new transaction.
        -  **Matching justification** - The agent populates this field with a justification / audit trial for its reasoning.
        -  **Unmatch / Reverse / Cancel payment** - Where the human review determines the agent matched/posted an incorrect transaction, these buttons can be used to unmatch or reverse the new transaction.

### Level 3: Independent Oversight

The DXC Agents are included in the Regression testing program with each new D365 preview version. <br>
Once testing is complete, the result is logged on Release notes. 

> Note: The regression testing covers a wide scenario range but is not guarenteed to cover all possible scenarios. It is still recommended customer tests in their environment on their data.

### Level 4: Management Reporting

The following reporting is available in DXC Agent for Bank reconciliation:

- **All agents**
    - **Dashboard** - Where dashboard applies to the agent and 'Enable telemetry' is set to _Yes_, the power user can view telemetry by month on 'Go to dashboard'. Examples of what is logged can be viewed on each agent's user guide.

