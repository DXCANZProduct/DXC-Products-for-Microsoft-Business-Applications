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

