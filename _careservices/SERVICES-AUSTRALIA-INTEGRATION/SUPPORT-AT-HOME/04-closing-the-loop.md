---
layout: product-content
title: "Closing the Loop"
header: Care Services
toc: false
description: "Re-run the budget, budget details, and account summary to confirm Services Australia reflects the completed claim and payment — closing the Support at Home funding cycle."
---

# Closing the Loop

The claim is paid and reconciled in D365. Now confirm Services Australia agrees. Re-run the same three imports from the start — budget, budget details, account summary — and check the numbers have moved.

---

## 1 — Re-run the budget

**Staging workbench → Import → Budget → Care recipient**

Same care recipient, same import. This time, look at the **Available** and **Amount used** columns.

![Updated budget — amount used increased, available balance reduced](./IMAGES/budget-periods-available-balance.png)

The amount used has increased and available balance has decreased by the value of the claims processed this cycle. If these numbers haven't moved, the claim hasn't settled yet — check claim status and try again.

---

## 2 — Re-run the budget details

**Import → Budget → Details** — same budget ID.

![Updated budget details — new invoice usage lines visible](./IMAGES/budget-details-entitlements-usage.png)

The new invoice lines now appear in the usage section. Each line shows the service code, invoice ID, and amount drawn. The usage total should match the updated **Amount used** in the budget header — that's your end-to-end confirmation.

---

## 3 — Re-run the account summary

**Import → Payment → Account summary**

The account summary now reflects this payment in the period totals: claims submitted, claims approved, payments made, and the updated closing balance.

---

## The full cycle — done

Every step is traceable in the staging workbench with a UUID transaction ID. Here's the complete picture:

| Step | What happened |
|---|---|
| Budget checked | Available funding confirmed before raising the claim |
| Budget details checked | Entitlements and prior usage verified |
| Account summary reviewed | Provider financial position confirmed |
| Funding claim form | Invoice created and submitted to Services Australia |
| Claim created | Services Australia acknowledged — status: Pending approval |
| Payment statement | Payment confirmed, contribution deductions applied |
| Journal posted | Revenue and receivables recorded in D365 general ledger |
| Reconciliation run | Payment matched to claims — cycle closed |
| Budget re-checked | Services Australia reflects the completed activity ✅ |

---

**Ready for the next cycle?**

Go back to [Your Funding Position →](./01-funding-position.html) and start again for the next billing period.
